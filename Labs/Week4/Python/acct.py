def gen_acct( bal ):
	def withdraw( amt ) :
		global bal
		bal -= amt
		return amt
	def deposit( amt ) :
		global bal
		bal += amt
		return amt
	def dispatch( let ) :
		if let == 'w' :
			return withdraw
		elif let == 'd' :
			return deposit
		else :
			return None
	return dispatch

