public class Main {
        public static boolean checkRotation(String s1, String s2) {
            if (s1.length() != s2.length()) {
                return false;
            }
            String s3 = s1 + s1;
            if (s3.contains(s2))
                return true;
            else
                return false;
        }

        public static void main(String[] args) {
            String str1 = "Java J2EE Reverse Me";
            String str2 = "avaJ EE2J esreveR eM";
            System.out.println("Checking whether the given string is rotation of other or not:");
            if (checkRotation(str1, str2)) {
                System.out.println("Yes " + str2 + " is rotation of " + str1);
            } else {
                System.out.println("No " + str2 + " is not rotation of " + str1);
            }
        }
    }

