#!/usr/bin/python
#This is about the minimum Tkinter program
#
# Stolen from
# http://academic.evergreen.edu/curricular/modelingmotion/ExampleCode/gui/gui.php
#
# Editor: cols=80, tabstop=2
#

# This example has a say_hello() method which sets the text in a label to
# "Hello"
#   say_hello() in invoked when the button is pressed.

from Tkinter import *

title = "Some Dylan for Ya"
sampleText =  \
'''Early one morning the sun was shining,
I was layin' in bed.
Wonderin' if she'd changed at all,
or if her hair was stil red'''

class Application:

	def __init__(self, root):

		self.label = Label( root, text='A Label' )
		self.label.pack( side=RIGHT )

		self.helloButton = Button( root, text="Push Me",
			command=self.say_hello )
		self.helloButton.pack( side=LEFT )

	def say_hello(self):
		self.label.configure( text=sampleText )	# set the text in the label


toplevel_window = Tk()
toplevel_window.title( title )

app = Application( toplevel_window )

toplevel_window.mainloop()



