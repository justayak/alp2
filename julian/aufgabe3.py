def root(n):
	r = 0
	k = 1
	while (r + r + k) < n:
		r = r + k
		k = k + 1
	return k
	
print root(8)