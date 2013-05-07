def mersenne(n):
	base = 2
	i=0
	while i<n:
		mersenne = base-1
		base = base*2
		i+=1
	return mersenne

a = int(input("Zahl eingeben:"))
print(mersenne(a))

