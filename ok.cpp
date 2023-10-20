#include <iostream>

using namespace std;

int main() {
    double num1, num2, result;
    char op;

    cout << "Enter the first number: ";
    cin >> num1;

    cout << "Enter an operator (+, -, *, /): ";
    cin >> op;

    cout << "Enter the second number: ";
    cin >> num2;

    switch (op) {
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                cout << "Error: Division by zero is not allowed." << endl;
                return 1; // Exit with an error code
            }
            break;
        default:
            cout << "Error: Invalid operator" << endl;
            return 1; // Exit with an error code
    }

    cout << "Result: " << num1 << " " << op << " " << num2 << " = " << result << endl;
 
// Push - c

// Pull

    return 0;
}
