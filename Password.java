import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.*;

public class Password {
    //throws keyword is used to declare an exception
    public static void main(String[] args) throws NoSuchAlgorithmException {


        //Access functions/methods
        password();

    }


    public static void password() throws NoSuchAlgorithmException {

        String passwordToHash = "password";
        //null is a reserved word for literal values
        String generatedPassword = null;
        try {
            //Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            //Add password bytes to digest
            md.update(passwordToHash.getBytes());
            //Get the hash's bytes
            byte[] bytes = md.digest();
            //This bytes[] has bytes in decimal format;
            //Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            //Get complete hashed password in hex format
            generatedPassword = sb.toString();


        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        getSalt(generatedPassword);


    }

        public static void getSalt (String p) throws NoSuchAlgorithmException {

            //Always use a SecureRandom generator
            SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
            //Create array for salt
            byte[] salt = new byte[16];
            //Get random salt
            sr.nextBytes(salt);

            String x = Base64.getEncoder().encodeToString(salt);

            addition(p, x);

        }
            public static void addition (String password, String salt)
            {

                password = password.concat(salt);
                String note = "The hashed password is " + password;

                Path path = Paths.get("output.txt");

                try {
                    Files.writeString(path, note, StandardCharsets.UTF_8);
                } catch (IOException ex) {
                    System.out.println("error");
                }

                System.out.println("The password is " + password);
            }
        }





