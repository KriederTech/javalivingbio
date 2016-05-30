/**
 * 
 */
package com.gmg.util;

/**
 * @author LASANA.CRIDER
 *
 */

import java.security.Key;
import java.util.logging.Logger;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.springframework.security.crypto.password.PasswordEncoder;
public class StrongAES implements PasswordEncoder{
	  static Logger logger = Logger.getLogger("StrongAES");
	  private String key = "1234Bar123456Bar123456"; // 128 bit key

	/**
	 * 
	 */
	public StrongAES() {
		// TODO Auto-generated constructor stub
	}


	  public String decrypt(byte[] encrypted) {
	    String decrypted = "";
	    byte[] encryptText;
	    try {
	      // Create key and cipher
	      Key aesKey = new SecretKeySpec(Base64.decodeBase64(key), "AES");
	      encryptText = Base64.decodeBase64(new String(encrypted));
	      Cipher cipher = Cipher.getInstance("AES");
	      // decrypt the text
	      cipher.init(Cipher.DECRYPT_MODE, aesKey);
	      decrypted = new String(cipher.doFinal(encryptText));
	    } catch (Exception e) {
	      logger.info("Exception info: " + e);
	    }
	    return decrypted;
	  }

	  @Override
	  public String encode(CharSequence rawPassword) {
	    String encrypted = "";
	    try {
	      // Create key and cipher
	      Key aesKey = new SecretKeySpec(Base64.decodeBase64(key), "AES");
	      Cipher cipher = Cipher.getInstance("AES");
	      // encrypt the text
	      cipher.init(Cipher.ENCRYPT_MODE, aesKey);
	      encrypted = Base64.encodeBase64String(cipher.doFinal(rawPassword.toString().getBytes()));
	    } catch (Exception e) {
	      logger.info("Exception: " + e);
	    }
	    return encrypted;
	  }

	  @Override
	  public boolean matches(CharSequence rawPassword, String encodedPassword) {
	    if (encodedPassword == null || encodedPassword.length() == 0) {
	      logger.info("Empty encoded password");
	      return false;
	    }
	    return checkpw(rawPassword.toString(), encodedPassword);
	  }

	  private boolean checkpw(String rawPassword, String encodedPassword) {
	    return rawPassword.equals(decrypt(encodedPassword.getBytes()));
	  }
	}
