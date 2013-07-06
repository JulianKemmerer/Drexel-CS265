# linked-list.py - an example of a singly-linked list
#
# Kurt Schmidt
# Oct '06
#

import sys;

def main( argv=sys.argv ) :

	L = [24, None]

	t = [13, None]
	t[1] = L
	L = t

	t = [28, None]
	t[1] = L[1]
	L[1] = t

	t = [3, None]
	p = L
	while p != None :
		q = p
		p = p[1]
	
	if p == L :
		L = t
	else :
		q[1] = t

	print L

if __name__ == "__main__" :   # then this was NOT included in another file
	main()


