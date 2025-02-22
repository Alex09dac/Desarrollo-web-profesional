import pandas as pd

kid_gifts = {
    'videogames' :'Play5',
    'boardgames' :'Monopoly',
}

serie = pd.Series(kid_gifts)

print(f'\n{serie}')
