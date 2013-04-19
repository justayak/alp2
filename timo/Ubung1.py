import random
import sys
import math

# Uebung 1

# Aufgabe 1a
def pyth_nums(a,b,c):
    """Überprueft ob es sich bei den eingegebenen Werten um ein sogenanntes Pythagoraeisches Zahlentripel handelt."""
    if ((a*a) + (b*b) == (c*c)):
    	return True
    else :
    	return False
		
# Aufgabe 1b
# 3 For-Schleifen, die jeweils hochzählen. Da a < b sein muss ist a = n-1, b = n, und c = n+ 1, da range einen abzieht.
# Für jedes Tripel wird erst mit pyth_nums geprüft und dann ob a<b<c<n ist. Falls True eintrag in die Liste
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
# die for-schleife geht das Wort, oder den Satz Zeichen für Zeichen durch und erzeugt jeweils einen Eintrag, wenn das Zeichen nicht
# im Wörterbuch ist. Dazu wird anschließend die Anzahl gezählt und dann mit dic.update eingetragen.
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
    size = 172
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
    if (y <= (size/2)) and (x >(y)) and (x<(size - y)):     # y<=(size/2) ist obere Hälfte und x>y und x<(size-y) ==> zeichnet dreieck oben
        return '.'
    elif y < (size/2) and (x >= size-y) or (y>= (size/2)) and (x>size-(size-y)):    # zeichnet dreieck rechts
        return '∏'
    elif (y> (size/2)) and (x <= (size/2)) and (((x < (size/40)*6) or (x > (size/40)*14)) or ((y < (size/40)*26) or (y > (size/40)*34))):   # zeichnet quadrat unten links
        return '*'
    else: 
        return ' '

def diamond(x,y,size):
    if ( y<=(size/2) and x>(size/2)-y and x<(size/2)+y ) or ( y>size/2 and x < (size-y+size/2) and x>(y-size/2)):   #zeichnet diamond
        return '|'
    else:
        return ' '

# a² + b² = c²
# rechnet mit satz des pythagoras entfernung von mitte zur position(x,y) aus und zeichnet alle wo Abstand< size/2 ist
def circle(x,y,size):
    if size/2 > math.sqrt (math.pow((math.fabs(size/2-x)) ,2) + math.pow( (math.fabs(size/2-y)) ,2)):   return '*'
    else:
        return ' '

# teilt die koordinate x und y jeweils durch 8 (für 8 Felder) und rechnet dann mod 2 um auf das jeweilige Feld zu kommen.
def chessboard(x,y,size):
    if (x/((size/8)))%2 < 1 and (y/((size/8)))%2<1: 
        return '□'
    elif (x/(size/8))%2 >=1 and (y/(size/8))%2 >=1:
        return '□'
    else:
        return ' '


def gossip(n):
    guestlist = []              #init leere guestlist
    guestlist += [1]            #erster Gast erzeugt gerücht
    for i in range(1,n-1):      #alle anderen haben das Gerücht nocht nicht gehört und werden mit 0 init
        guestlist += [0]

    #show list
    #print(guestlist)
    #print(len(guestlist))

    next_one = 0                                            # variable, damit der Erzählende sich dasw Gerücht nicht selbst erzählt.
    listener = 0                                            # listener für zufallsvariable
    for j in range(n-1):                                    # geht das ganze max n-1 mal durch, wird aber weiter untern abgebrochen, falls einer das Gerücht schon kennt
        while listener == 0 or listener == next_one:        # wenn listener == 0 ist oder der listener = der hörende(next_one) ist wird ein neuer Zufallswert erzeugt
            listener = random.randint (0,(len(guestlist))-1)  # zuweisung Zufallswert der zwischen 0 und anzahl der guestlist
            #print (listener)
        if guestlist[listener] == 0:                        # wenn er das gerücht nicht kannte, kennt er es jetzt
            guestlist[listener] = 1
            next_one = listener
        else:                                               # sonst fertig
            break
    n=0
    #print(guestlist)
    for k in range(len(guestlist)):                         # zählt anzahl, derjenigen, die es jetzt kennen.
        if guestlist[k] == 1:
            n += 1
    return n

def check_gossip(times, guests):
    anz = 0
    for i in range(1, times):
        anz = anz + gossip(guests)
    return anz, anz/times

# a) Bei 100.000 Testdurchläufen haben es 1.034.428 Gäste erfahren, im
# Durchschnitt waren es dementsprechend 10.34428 => bei 51 Gästen
# Stochastik Aufgabe noch ergänzen !!!

def check_gossip2(guests):
    n = 0
    while n != (guests-1):
        n = gossip(guests)
    return True
