    package eh;

    public class Main {
        public static void main(String[] args) {
            int a = 10;
            int b = 0;
            try {
                //    divide(a,b) ; // finally dont run without try block but it can run when try block is empty
                String name = "dev";
                throw new MyException("Name is Dev");
            }
           catch(MyException e){
                    System.out.println(e.getMessage());
                }

            catch(Exception e){
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("this will always executes");
            }
    }
            static int divide (int a, int b) throws Exception{ //we shouldnt use throws Exception here if we throw new specific exception(like ArithmeticExceptoin)
                if(b==0){
                    throw new Exception("please dont divide by zero");
                }
                return a/b;

        }
    //    throw: used to create and throw an exception manually inside a method
    //        throws: used in method declaration to indicate the method may throw exceptions.
    }
