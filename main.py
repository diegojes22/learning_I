# CALCULADORA SENCILLA CON PYTHON
if(__name__ == "__main__"):
    operation : str = ""
    result : float = 0.0

    while True:
        operation = input("Ingrese la opercion: ")

        result = eval(operation)
        print(result)

        exit_app = input("Desea salir? S/N ")
        if exit_app ==  "S" or exit_app ==  "s":
            break