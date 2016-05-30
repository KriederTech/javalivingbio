/**
 * 
 */
package com.gmg.util;

/**
 * @author LASANA.CRIDER
 *
 */
//package com.thinkclear.livingbio.security;

import java.security.SecureRandom;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class BCryptPasswordEncoder  {
  private Pattern BCRYPT_PATTERN = Pattern.compile("\\A\\$2a?\\$\\d\\d\\$[./0-9A-Za-z]{53}");
  private final Logger logger = Logger.getLogger(BCryptPasswordEncoder.class.getName());

  private final int strength;

  private final SecureRandom random;

  public BCryptPasswordEncoder() {
      this(-1);
  }

  /**
   * @param strength the log rounds to use
   */
  public BCryptPasswordEncoder(int strength) {
      this(strength, null);
  }

  /**
   * @param strength the log rounds to use
   * @param random the secure random instance to use
   *
   */
  public BCryptPasswordEncoder(int strength, SecureRandom random) {
      this.strength = strength;
      this.random = random;
  }

  public String encode(CharSequence rawPassword) {
      String salt;
      if (strength > 0) {
          if (random != null) {
              salt = BCrypt.gensalt(strength, random);
          }
          else {
              salt = BCrypt.gensalt(strength);
          }
      }
      else {
          salt = BCrypt.gensalt();
      }
      return BCrypt.hashpw(rawPassword.toString(), salt);
  }

  public boolean matches(CharSequence rawPassword, String encodedPassword) {
      if (encodedPassword == null || encodedPassword.length() == 0) {
          logger.warning("Empty encoded password");
          return false;
      }

      if (!BCRYPT_PATTERN.matcher(encodedPassword).matches()) {
          logger.warning("Encoded password does not look like BCrypt");
          return false;
      }

      return BCrypt.checkpw(rawPassword.toString(), encodedPassword);
  }
}
