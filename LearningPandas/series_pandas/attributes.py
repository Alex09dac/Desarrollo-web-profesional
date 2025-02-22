import pandas as pd


good_student_qualities = ['Self-Discipline', 'Self-Discipline', 'Goal-Oriented', 'Punctuality', 'Diligence and Hard Work', 'Respectful', ]
serie = pd.Series(good_student_qualities)
print(serie)

# El tamaño de la serie
print(f'El tamaño de la serie es la siguiente: {serie.size}')

# La serie tiene valores duplicados
print(f'La serie  tiene valores duplicados: {serie.is_unique}')

# Información de los indices
print(f'Este atributo nuestra información de los indices: {serie.index}')

# Informacion del almacenamiento de los valores de la serie
print(f'Información de los valores de la serie: {serie.values}')

# Informacion del tipo de datos que se utilizan para alamacenar los valores de la serie
print(f'Tipo de datos: {type(serie.values)}')
