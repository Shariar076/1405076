.MODEL SMALL
.STACK 100H
.DATA

A DB ?


.CODE


MAIN PROC 
    MOV AX,@DATA
    MOV DS,AX
    
    MOV AH,1
    INT 21H
    SUB AL,'0'
    MOV BL,AL
    INC BX
    
	
    MOV AH,2
	MOV DL, 0AH
	INT 21H
    MOV DL, 0DH
    INT 21H
    
    MOV A,0
    
    L1:
        DEC BX
        
        MOV CX,BX

        L3: 
            MOV AH,2	
	        MOV DL,' '
	        INT 21H
	    LOOP L3  
                   
        INC A
        MOV CX,0
        MOV CL,A
       
        L2: 
            MOV AH,2	
	        MOV DL,'*'
	        INT 21h
	        MOV DL,' '
	        INT 21h
	    LOOP L2 
	    
	    MOV AH,2
	    MOV DL, 0AH
	    INT 21H
	    MOV DL, 0DH
	    INT 21H
	    
	    MOV CX,BX

  
	    	 
	LOOP L1	
    
    EXIT:
        .EXIT