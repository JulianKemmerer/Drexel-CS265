#!/usr/bin/python
# gridexample.py - tkinter example of the grid layout
#
# Stolen from
# http://academic.evergreen.edu/curricular/modelingmotion/ExampleCode/gui/gui.php
#
# Editor: cols=80, tabstop=2
#
# Demonstrates:  Tk, title, Button, mainloop
#

# This example uses the grid() method to make a grid of buttons (which don't
# do anything)

from Tkinter import *

class Application:
	def __init__(self,root):
		root.title("Grid Example")

		for y in range(10):
			for x in range(10):
				button = Button(root,text="(%d,%d)" % (x,y))
				button.grid(row=y,column=x)

root = Tk()

app = Application(root)

root.mainloop()

