def mersenne(n):
	assert(n>0)
	base = 2
	i=0
	mersenne=0
	while i<n:
		assert(mersenne == (2**i)-1)
		mersenne = base-1
		base = base*2
		i+=1
	assert(mersenne==(2**n-1))
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
		assert(i<=len(array) and count1 <= len(array) and len(array) >0)
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
		assert(i<=len(array) and count2 <= len(array) and len(array) >0)
		if array[i] == current:
			count2 = count2 + 1
		i+=1
	if count2 > len(array)/2:
		return current
	return None

array = [1,1,1,2,2,3,4,1,1]
print(majority(array))
