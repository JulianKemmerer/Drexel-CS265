#!/usr/bin/python
#This is about the minimum Tkinter program
#
# Stolen from
# http://academic.evergreen.edu/curricular/modelingmotion/ExampleCode/gui/gui.php
# 
# Editor: cols=80, tabstop=2
#

import Tkinter        # import the Tkinter module

title = "Some Dylan for Ya"
sampleText =  \
'''Early one morning the sun was shining,
I was layin' in bed.
Wonderin' if she'd changed at all,
or if her hair was stil red'''

root = Tkinter.Tk()   # create a root window
root.title( title ) # set the text in the title bar of the window

label = Tkinter.Label( root, text=sampleText )
label.pack()          # nothing is visible until this line is executed

root.mainloop()       # start the event loop

