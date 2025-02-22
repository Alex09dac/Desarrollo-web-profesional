result = None
numero_x = 10
numero_y = 2


try:
    numero_x = int(input("Ingresa un numero para X : "))
    numero_y = int(input("Ingresa un numero para Y:"))
    result = numero_x / numero_y

    print(f'\nEl resultado de la division es: {result}')
except ZeroDivisionError as e:
    print(f'La excepción es la siguiente: {e}')
except ValueError as e:
    print(f'La excepción de ValueError genero el siguiente mensaje: {e}')
except Exception as e:
    print(f'La excepción de Exception el siguiente mensaje: {e}')
finally:
    print('Nuestro programa ha finalizado')