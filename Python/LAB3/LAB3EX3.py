while True:
  command=input('Enter command:')
  if len(command) == 0: # No command - try again
    continue
  elif command == 'exit': # User exit
    print('Goodbye')
    break
  else:
    print('You entered command: %s' % command)

print('bye')