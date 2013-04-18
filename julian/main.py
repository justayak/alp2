import random

#shit happened
def gossip (n):
	if n<51:
		return -1
	else:
		list = [0] * n; # alle Leute auf der Party:
		victim = random.randint(0,n-1)
		list[victim] = -1
		current = random.randint(0,n-1)
		list[current] = 1
		while current == victim:
			list[current] = 0
			current = random.randint(0,n-1)
			list[current] = 1
		previous = current
		
		while True:
			current = random.randint(0,n-1)
			if list[current] == -1 or current == previous:
				continue
			elif list[current] == 1:
				break
			else:
				list[current] = 1
				previous = current
				
		
		return list.count(1)
		
		
a = int(input("mach:"))

total = []
for i in range(0, 10000):
	total.append(gossip(a))

avarage = sum(total) / len(total)

print("Druchschnitt: ", avarage)