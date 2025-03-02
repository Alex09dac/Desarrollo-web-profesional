import pandas as pd

nba_players_name = pd.read_csv('/Users/Alexcirilo/Downloads/nba_players_a.csv', sep=',', usecols=['Name']).squeeze()
nba_players_age = pd.read_csv('/Users/Alexcirilo/Downloads/nba_players_a.csv', sep=',', usecols=['AGE']).squeeze()
print(f'nombre de los jugadores: \n', nba_players_name)
print(f'\nedad de los jugadores: \n', nba_players_age)

print(f'funcion Len: {len(nba_players_name)}')
print(f'funcion Type: {type(nba_players_name)}')
print(f'funcion SORTED: {len(nba_players_age)}')
print(f'funcion MAX: {max(nba_players_age)}')
print(f'funcion MIN: {min(nba_players_age)}')
