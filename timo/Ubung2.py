# Uebung 2

# Aufgabe 1
def change(betrag):
	wechselgeld = []
	while not (betrag == 0):
		if (betrag // 200) != 0:
			wechselgeld.append(200)
			betrag -= 200
		elif (betrag // 100) != 0:
			wechselgeld.append(100)
			betrag -= 100
		elif (betrag // 50) != 0:
			wechselgeld.append(50)
			betrag -= 50
		elif (betrag // 20) != 0:
			wechselgeld.append(20)
			betrag -= 20
		elif (betrag // 10) != 0:
			wechselgeld.append(10)
			betrag -= 10
		elif (betrag // 5) != 0:
			wechselgeld.append(5)
			betrag -= 5
		elif (betrag // 2) != 0: 
			wechselgeld.append(2)
			betrag -= 2
		elif (betrag // 1) != 0:
			wechselgeld.append(1)
			betrag -= 1
	return wechselgeld
