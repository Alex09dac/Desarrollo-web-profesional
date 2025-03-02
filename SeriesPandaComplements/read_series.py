import pandas as pd

nba_players = pd.read_csv('/Users/Alexcirilo/Downloads/nba_players_a.csv', sep=',', usecols=['Name']).squeeze()
#funcion describe
print(f'fucnion describe con una ssrie: {nba_players.describe()}')
print(nba_players.describe())

#F head
print(f'5 elemtos de la serie: \n {nba_players.head()}')
print(f'\n\n 10 elemtos de la serie: \n {nba_players.head(10)}')

#F tail
print(f'\n\n ultimos 5 elemtos de la serie: \n {nba_players.tail}')
print(f'\n\n ultimos 10 elemtos de la serie: \n {nba_players.tail(10)}')
