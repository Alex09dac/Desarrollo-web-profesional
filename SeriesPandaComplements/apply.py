import pandas as pd

def convert_to_upper(value):
    return value.upper()
nba_players = pd.read_csv(r'/Users/Alexcirilo/Downloads/nba_players_a.csv', usecols=['Name']).squeeze()
result = nba_players.apply(convert_to_upper).head()
print(result)