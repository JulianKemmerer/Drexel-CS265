#!/usr/bin/python
# pack.py - Tkinter example, packing widgets
#
# Stolen from
# http://academic.evergreen.edu/curricular/modelingmotion/ExampleCode/gui/gui.php
#
# Editor: cols=80, tabstop=2
#
# Demonstrates: Tk, pack
#

from Tkinter import *

title = "Some Dylan for Ya"
text1 =  \
'''Early one morning the sun was shining,
I was layin' in bed.'''
text2 = \
'''Wonderin' if she'd changed at all,
or if her hair was stil red'''

root = Tk()
root.title( title )

label = Label( root, text=text1 )
label.pack( side=BOTTOM )
label = Label( root, text=text2 )
label.pack( side=TOP )

root.mainloop()

print "Where will this string appear?"

