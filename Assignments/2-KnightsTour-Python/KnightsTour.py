#!/usr/bin/env python
import random #random numbers
import sys

class Move:
  def __init__(self):
    self.x = 0
    self.y = 0
    
class Position:
  def __init__(self):
    self.x = 0
    self.y = 0
    
class Knight:
  def __init__(self):
    self.x = 0
    self.y = 0
  
  def moveEndsOnBoard(self, move, numCol, numRow):
    tmpX = self.x
    tmpY = self.y
    tmpX += move.x
    tmpY += move.y
    return (tmpX >= 1 and tmpX <= numCol and tmpY>=1 and tmpY <= numRow)
    
  def move(self,move):
    self.x += move.x
    self.y += move.y
    
############

#8 rows and columns
if (len(sys.argv) >= 4): #1:command 2:rows 3: columns 4: tries
  numRow = int(sys.argv[1])
  numCol = int(sys.argv[2])
  numTries = int(sys.argv[3])
else:
  numRow = 5
  numCol = 5
  numTries = 10000;
  
listOfVistedPositions = []
listOfTriedBoards = []

def wasVisited(knight, move):
  newPos = Position()
  newPos.x = knight.x + move.x
  newPos.y = knight.y + move.y
  return contains(newPos, listOfVistedPositions)
  
def contains(position, listToCheck):
  exists = False;
  for i in range(0,len(listToCheck)):
     positionElement = listToCheck[i]
     if(positionElement.x == position.x and positionElement.y == position.y):
       exists = True
       return exists
  return exists
  
def printBoard(listOfVistedPositions):
  #Create empty board
  board = []
  rows = ["x"] *numRow
  for i in range(0, numCol):
    board.append(list(rows))
  #Loop through each position
  for i in range(1,len(listOfVistedPositions)+1):
    pos = listOfVistedPositions[i-1]
    board[pos.x-1][pos.y-1] = i
  
  output = ""
  for i in range(0, numRow):
    for j in range(0, numCol):
      #print "Trying i,j: " , i , j
      output += str(board[j][i]) + " "
    output += '\n'
  return output
    
def isSolved(listOfVistedPositions):
  solved = True
  for i in range(1,numCol+1):
    for j in range(1,numRow+1):
      newPos = Position()
      newPos.x = i
      newPos.y = j
      if(not contains(newPos,listOfVistedPositions)):
	solved = False
	return solved
  return solved
  
def uniqueBoard(strBoard):
  unique = True
  for i in range(0, len(listOfTriedBoards)):
    board = listOfTriedBoards[i]
    if(strBoard == board):
      unique = False
      return unique
  return unique
 
  
  
  
#Populate list of possible moves
listOfMoves = []
m0 = Move()
m0.x = 1
m0.y = 2
listOfMoves.append(m0)

m1 = Move()
m1.x = 2
m1.y = 1
listOfMoves.append(m1)

m2 = Move()
m2.x = 2
m2.y = -1
listOfMoves.append(m2)

m3 = Move()
m3.x = 1
m3.y = -2
listOfMoves.append(m3)

m4 = Move()
m4.x = -1
m4.y = -2
listOfMoves.append(m4)

m5 = Move()
m5.x = -2
m5.y = -1
listOfMoves.append(m5)

m6 = Move()
m6.x = -2
m6.y = 1
listOfMoves.append(m6)

m7 = Move()
m7.x = -1
m7.y = 2
listOfMoves.append(m7)

def getListOfValidMoves(knight):
  returnValue = []
  for i in range(0,len(listOfMoves)):
    move = listOfMoves[i]
    if(knight.moveEndsOnBoard(move, numCol, numRow) and (not wasVisited(knight,move))):
      returnValue.append(move)
  return returnValue



knight = Knight()

sucess = False;
tries = 0;
while(sucess == False and tries <= numTries):
  tries+=1
  #if(uniqueBoard(printBoard(listOfVistedPositions))):
    #print "Try: ", tries
    #print printBoard(listOfVistedPositions)
  listOfTriedBoards.append(printBoard(listOfVistedPositions))
  #Clear list of visited positions and move knight back
  listOfVistedPositions = []
  knight.x = 1;
  knight.y = 1;
  newPos = Position()
  newPos.x = knight.x
  newPos.y = knight.y
  listOfVistedPositions.append(newPos)
  moved = True
  listOfValidMoves = getListOfValidMoves(knight)
  while(len(listOfValidMoves) >0):
    #Create new list of valid moves for this try/position
    listOfValidMoves = getListOfValidMoves(knight)
    moved = False;
    r = random
    move = listOfValidMoves[r.randrange(0, len(listOfValidMoves))]
    knight.move(move)
    newPos = Position()
    newPos.x = knight.x
    newPos.y = knight.y
    listOfVistedPositions.append(newPos)
    listOfValidMoves = getListOfValidMoves(knight)
  #check for sucess after moving stopped
  if(isSolved(listOfVistedPositions)):
    sucess = True
if(tries > numTries):
  print "Failed!"
else:
  print "Sucess!"
print printBoard(listOfVistedPositions)
    
    
      

      


  
  


