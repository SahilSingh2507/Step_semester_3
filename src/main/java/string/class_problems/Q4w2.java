package string.class_problems;
    public class Q4w2 {

        static String maskPhoneNumber(String phone) {

            // Length validation
            if (phone.length() != 10) {
                return "Invalid phone number";
            }

            // Digit validation
            for (int i = 0; i < phone.length(); i++) {
                if (!Character.isDigit(phone.charAt(i))) {
                    return "Invalid phone number";
                }
            }

            // Masking
            StringBuilder sb = new StringBuilder("XXXXXX");
            sb.append("-");
            sb.append(phone.substring(6));

            return sb.toString();
        }

        public static void main(String[] args) {

            System.out.println(maskPhoneNumber("9876543210"));
            System.out.println(maskPhoneNumber("98765"));
        }
    }

