# CALCULADORA SENCILLA CON PYTHON
if(__name__ == "__main__"):
    operation : str = ""
    result : float = 0.0

    operation = input("Ingrese la opercion: ")

    result = eval(operation)
    print(result)