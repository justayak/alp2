#Aufgabe 1: n=44 Erg=[20,20,2,2]
from collections import deque

def change (n): 
	coins = [200,100,50,20,10,5,2,1]
	result = []
	for coin in coins:
		count = n // coin
		result += [coin] * count
		n = n % coin		
	return result
		
def changeWithWhile (n): 
	coins = deque([200,100,50,20,10,5,2,1])
	result = []
	while n != 0:
		coin = coins.popleft()
		count = n // coin
		result += [coin] * count
		n = n % coin		
	return result
				
inp = int(input("Geld: "));		
money = changeWithWhile(inp)

# Rückgabe wie in Tutorium besprochen
for coin in money:
	print(coin)
	
	