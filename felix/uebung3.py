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


def majority (array):
	if array == []:
		return None
	count1 = 0
	current = array[0]
	i = 0
	while i<len(array):
		if array[i]  == current:
			count1 = count1 + 1
		else:
			count1 = count1 - 1
		if count1 == 0:
			current = array[i]
			count1 = 1
		i+=1
	count2 = 0
	i=0
	while i<len(array):
		if array[i] == current:
			count2 = count2 + 1
		i+=1
	if count2 > len(array)/2:
		return current
	return None

array = [1,1,1,2,2,3,4,1,1]
print(majority(array))
