import pandas as pd

nba_players = pd.read_csv(r'/Users/Alexcirilo/Downloads/nba_players_a.csv', usecols=['DRtg']).squeeze()
some_values = nba_players.iloc[:5]

additions_1 = some_values + 10
additions_2 = some_values.add(10)

print('Realizacion de una suma')
print(some_values)
print(additions_1)
print(additions_2)
#########################################3
additions_1 = some_values - 10
additions_2 = some_values.add(10)

print('Realizacion de una resta')
print(some_values)
print(additions_1)
print(additions_2)

# realizar la operacio de multiplicacion