import random
import sys
import math

# Uebung 1

# Aufgabe 1a
def pyth_nums(a,b,c):
    """Ueberprueft ob es sich bei den eingegebenen Werten um ein sogenanntes Pythagoraeisches Zahlentripel handelt."""
    if ((a*a) + (b*b) == (c*c)):
    	return True
    else :
    	return False
		
# Aufgabe 1b
def phy_triples(n): 
    """Erzeugt eine Liste aller pythagoraeischen Zahlentripel, so dass a < b < c und <= n."""
    liste =[]
    for a in range(n-1):
        for b in range(n):
            for c in range(n+1):
                if (pyth_nums(a,b,c)):
                    if (a < b < c <= n):
                        liste = liste + [ (a,b,c) ]
    for i in range (len(liste)):
        print (liste[i])

            
# Aufgabe 2
def count_letters(wort):
    """Zaehlt wie oft die einzelnen Zeichen im Text vorkommen"""
    dic = {}
    for i in range(0,len(wort)):
        if wort[i] not in dic:
            n=0
            for j in range (0, len(wort)):
                if wort[j] == wort[i]:
                    n=n+1
            w={wort[i]:n}
            dic.update(w)
            n=0
    return dic

#Aufgabe 3
# vorgegeben:
def print_char_picture(decide_char_func):
    size = 40
    for i in range(0,size):
        for j in range(0,size):
            sys.stdout.write( decide_char_func(j,i,size) )
        print()

def diagonal(x,y,size):
    if x==y:
        return '@'
    else:
        return '.'

def grid(x,y,size):
    if (x%4==0) or (y%4==0):
        return '.'
    else:
        return ' '

def squares(x,y,size):
    if (y <= (size/2)) and (x >(y)) and (x<(size - y)):
        return '.'
    elif y < (size/2) and (x >= size-y) or (y>= (size/2)) and (x>size-(size-y)):
        return '∏'
    elif (y> (size/2)) and (x <= (size/2)) and (((x < (size/40)*6) or (x > (size/40)*14)) or ((y < (size/40)*26) or (y > (size/40)*34))):
        return '*'
    else: 
        return ' '

def diamond(x,y,size):
    if ( y<=(size/2) and x>(size/2)-y and x<(size/2)+y ) or ( y>size/2 and x < (size-y+size/2) and x>(y-size/2)):
        return '|'
    else:
        return ' '

#a² + b² = c²
def circle(x,y,size):
    if size/2 > math.sqrt (math.pow((math.fabs(size/2-x)) ,2) + math.pow( (math.fabs(size/2-y)) ,2)):
        return '*'
    else:
        return ' '

def chessboard(x,y,size):
    if (x/5)%2 < 1 and (y/5)%2 <1:
        return '□'
    elif (x/5)%2 >=1 and (y/5)%2 >=1:
        return '□'
    else:
        return ' '

def gossip(n):
    #init
    guestlist = [1] + ([0] * (n-2))    
    #tell j times
    previous = 0
    while True:
        listener = random.randint (0,(len(guestlist)-1))
        if listener == previous:
            continue
        elif guestlist[listener] == 1:
            break
        else:
            guestlist[listener] = 1
            previous = listener	
    return guestlist.count(1)

def check_gossip(times, guests):
    a = int(input("mach:"))

    total = []
    for i in range(0, 10000):
        total.append(gossip(a))

    avarage = sum(total) / len(total)

    print("Druchschnitt: ", avarage)

# a) Bei 100.000 Testdurchläufen haben es 1.027.827 Gäste erfahren, im
# Durchschnitt waren es dementsprechend 10.27827
