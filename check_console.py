from sys import executable
from subprocess import Popen, CREATE_NEW_CONSOLE
import subprocess

#subprocess.call('sample_console.py', shell=True)

subprocess.call([executable, 'sample_console.py'], creationflags = CREATE_NEW_CONSOLE)
