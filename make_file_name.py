"""
Sends a filename to the clipboard, without spaces and correct extension for the programming languages that I will use.
Usage: make_file_name <j | p | jl | cp> <filename>
where:
j - java
p - python
jl - julia
cp - C++
"""
import sys
import os

LANG_EXT = {
		"j": "java",
		"p": "py",
		"jl": "jl",
		"cp": "cpp"
	}

def make_file_name(title, lang):
	title = title.replace(" ", "_").lower()
	return title + "." + LANG_EXT[lang]
	
	
def add_to_clipboard(text):
	command = "echo " + text.strip() + "| clip"
	os.system(command)
	
	
def filename_to_clipboard(title, lang):
	filename = make_file_name(title, lang)
	add_to_clipboard(filename)

	
if __name__ == "__main__":
	lang = sys.argv[1]
	title = sys.argv[2]
	filename_to_clipboard(title, lang)