public class SimpleCalculator {
        private double firstNumber ;
        private double secondNumber;

    public SimpleCalculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    //getter
        public double getFirstNumber() {
            return firstNumber;
        }
    //getter
        public double getSecondNumber() {
            return secondNumber;
        }
    //setter
        public void setFirstNumber(double firstNumber) {
            this.firstNumber = firstNumber;
        }
    //setter
        public void setSecondNumber(double secondNumber) {
            this.secondNumber = secondNumber;
        }

      //public methods

        public double getAdditionResult() {
            return firstNumber + secondNumber;
        }

        public double getSubtractionResult() {
            return firstNumber - secondNumber;
        }

        public double getMultiplicationResult() {
            return firstNumber * secondNumber;
        }

        public double getDivisionResult() {
            if (secondNumber == 0) {
                return 0.0;
            }
            return firstNumber / secondNumber;
        }
    }

