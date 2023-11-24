print(f"There are {str([*range(1 ,101)]).count('9')-1} 
doors with 9s on them, however there is one door with double 9's \n    
doors with 9's:\n{[d for d in range(1,101) if '9' in str(d)]}")
