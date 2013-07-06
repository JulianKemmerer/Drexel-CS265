# linked-list.py - an example of a singly-linked list
#
# Kurt Schmidt
# Oct '06
#
# NOTE: Hobbled.  Does not run.  Do not refer to this as an example Python
#		program
#
# EDITOR: tabstop=2
#


main( argv=sys.argc ) :

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

if _name_ == "_main_" :   # then this was NOT included in another file
	main()


