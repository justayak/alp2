import random
import sys
import math

#Testet, ob Drei Zahlen ein pythagoraeisches Zahlentripel sind
def pyth_nums(a,b,c):
	return a*a+b*b==c*c or c*c+b*b==a*a or a*a+c*c==b*b

"""	
a=int(input("Zahl 1:"))
b=int(input("Zahl 2:"))
c=int(input("Zahl 3:"))

print(pyth_nums(a,b,c))"""

def phy_triples(n):
	liste=[]
	for a in range(1,n+1):
		for b in range(a,n+1):
			for c in range(b,n+1):
				if pyth_nums(a,b,c):
					tupel=(a,b,c)
					liste.append(tupel)
	return liste
	
"""a=int(input("Zahl eingeben:"))

print(phy_triples(a))"""

def wordcounter(eingabe):
	woerterbuch={}
	for i in range(0,len(eingabe)):	
		if eingabe[i] not in woerterbuch:#prueft, ob Buchstabe schon im Dic ist
			temp=1
			for j in range(i+1,len(eingabe)):
				if eingabe[i]== eingabe[j]:
					temp+=1
			woerterbuch.update({eingabe[i]:temp})
	return woerterbuch
"""
a=input("String eingeben: ")
print(wordcounter(a))
"""

def gossip (n):
	if n<=50:#Pruefen ob Eingabe kleiner 50
		print("Zu kleine Zahl")
	else:
		liste=[]
		opfer=0
		aktiv=0
		rand=random.randint(0,n-1)
		opfer=rand#Opfer von Geruecht wird festgelegt
		rand=random.randint(0,n-1)
		aktiv=rand#der, der mit Geruecht beginnt wird festgelegt
		while aktiv==opfer:#wenn Opfer=Aktiv neuen Aktiven belegen
			rand=random.randint(0,n-1)
			aktiv=rand
		while aktiv not in liste:#Prueft,dass Gleiche nicht 2X Geruecht erzaehlt
			liste.append(aktiv)
			rand=random.randint(0,n-1)
			if rand!=opfer:
				aktiv=rand
		return len(liste)		
		
		
"""	
a=int(input("Gib die Gaesteanzahl ein: "))
print(gossip(a))

liste=[]
anzahlGaeste=51
for i in range (0,10000):
	liste.append(gossip(anzahlGaeste))
sum=0
for i in range(0,len(liste)):
	sum+=liste[i]
print(sum/len(liste))"""

#Bei 51 Personen sind es im Durchschnitt 7,8 Personen die das Geruecht erfahren	


def print_char_picture(decide_char_func):
    size = 40
    for i in range(0,size):
        for j in range(0,size):
            sys.stdout.write( decide_char_func(j,i,size) )
        print()

def diamond(x,y,size):
	halfsize=size/2
	if y<halfsize:
		if x<=size/2-y or x>=size/2+y:
			return ' '
		else:
			return '|'
	else: 
		if x<=size/2-(size-y) or x>=size/2+(size-y):
			return ' '
		else:
			return '|'	

def cheeseboard(x,y,size):
	if (x/5)%2<1:#zum testen auf jeweils 5 nachfolger
		if (y/5)%2<1:
			return ' '
		else:
			return '+'
	else:
		if (y/5)%2<1:
			return '+'
		else:
			return ' '
	
def circle(x,y,size):
	if math.sqrt(math.fabs(math.pow((x-size/2),2))+math.fabs(math.pow((y-size/2),2)))<size/2:
		return '*'
	else:
		return ' '

def dreieck(x,y,size):
	if y<=x:
		if x>=size-y:
			return '+'
		else:
			return '*'
	else:
		return ' '

		
print_char_picture(dreieck)
	
	
