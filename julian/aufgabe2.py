#Aufgabe 1: n=44 Erg=[20,20,2,2]

def change (n): 
	coins = [200,100,50,20,10,5,2,1]
	result = []
	for coin in coins:
		count = n // coin
		result += [coin] * count
		n = n % coin		
	return result
		
		
		
money = change(338)

for coin in money:
	print(coin)
	
	