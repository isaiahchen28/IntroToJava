// an instance of this class represents a simple calculator.  The
// calculator keeps track of two operands (ints) and an operator (a
// char, one of '+', '*', '-', and '/'.)

public class Calculator{
   
	/* add data fields (instance variables) here */
	int operandOne;
	int operandTwo;
	char operator;

    /*
     * Method Clear
     * Clears out entire calculator
     */
    void Clear(){
    	/* fill in this method */
    	operandOne = 0;
    	operandTwo = 0;
    	operator = '\0';
    }

    /*
     * Method EnterDigitOfFirstOperand
     * Takes a digit and appends it to the end of the first operand
     * e.g. if the operand is already 32 and the digit is 4, the operand
     * should become 324
     */
    void EnterDigitOfFirstOperand(int digit){
    	/* fill in this method */
    	operandOne = operandOne*10+digit;
    }
    
    /*
     * Method GetFirstOperand
     * A "getter" method. Returns the first operand of the formula being entered
     */
    int GetFirstOperand(){
    	/* remove the line below and fill in this method */
    	return operandOne;
    }

    /*
     * Method EnterDigitOfSecondOperand
     * Takes a digit and appends it to the end of the second operand
     */
    void EnterDigitOfSecondOperand(int digit){
    	/* fill in this method */
    	operandTwo = operandTwo*10+digit;
    }
    
    /*
     * Method GetSecondOperand
     * A "getter" method. Returns the second operand of the formula being entered
     */
    int GetSecondOperand(){
    	/* remove the line below and fill in this method */
    	return operandTwo;
    }

    /*
     * Method EnterOperator
     * Takes a mathematical operator and stores it
     */
    void EnterOperator(char op){
    	/* fill in this method */
    	operator = op;
    }
    
    /*
     * Method ComputeAnswer
     * Evaluates the formula entered
     */
    int ComputeAnswer(){
    	/* remove the line below and fill in this method */
    	if(operator == '+'){
    		return operandOne+operandTwo;
    	}
    	if(operator == '-'){
    		return operandOne-operandTwo;
    	}
    	if(operator == '*'){
    		return operandOne*operandTwo;
    	}
    	if(operator == '/'){
    		return operandOne/operandTwo;
    	}
    	else{
    		return 0;
    	}
    } 
}