import pygame as p

import ChessEngine

WIDTH = HEIGHT = 512 # 400 is another option
DIMENSION = 8 # dimensions of a chess board are 8x8
SQ_SIZE = HEIGHT // DIMENSION 
MAX_FPS = 15 # for animation
IMAGES = {}

# loading images is a very expensive thing. Initialize a global dictionary of images

def loadImages():
    pieces =["bR", "bN", "bB", "bQ", "bK", "bB", "bN", "bR", "bP", "bP", "bP", "bP", "bP", "bP", "bP", "bP",
            "wP", "wP", "wP", "wP", "wP", "wP", "wP", "wP", "wR", "wN", "wB", "wQ", "wK", "wB", "wN", "wR"]
    for piece in pieces:
        IMAGES[piece] = p.transform.scale(p.image.load("img/" + piece + ".png"), (SQ_SIZE, SQ_SIZE))

# Main loader

def Main():
    p.init()
    screen = p.display.set_mode((WIDTH, HEIGHT))
    clock = p.time.Clock()
    screen.fill(p.Color("white"))
    # Make a constructor
    gs = ChessEngine.GameState()
    print(gs.board)