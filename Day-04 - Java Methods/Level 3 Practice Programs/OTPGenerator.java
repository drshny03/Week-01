//class to generate unique OTPs
class OTPGenerator{

    //method to generate a 6-digit OTP
    public static int generateOTP() {
		//generate otp using math class
        int otp = (int) (Math.random() * 900000) + 100000;
		
		//return generated otp
		return otp;
    }

    //method to ensure otp's are unique
    public static boolean validateUniqueOTPs(int[] otps){
		
		//iterate throw array which store otp
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
				//check if any two OTPs are the same and return result
                if (otps[i] == otps[j]) {
                    return false; 
                }
            }
        }
		//return true if all OTPs are unique
        return true;
    }

    // main method
    public static void main(String[] args){
		
        //array to store OTPs
        int[] otps = new int[10];

        //generate random OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        //display generated OTPs
        System.out.println("Generated OTPs ");
        for (int otp : otps) {
            System.out.println(otp);
        }

        //validate and display result
        boolean isUnique = validateUniqueOTPs(otps);
        System.out.println("Are all OTPs unique? " + (isUnique ? "Yes" : "No"));
    }
}
