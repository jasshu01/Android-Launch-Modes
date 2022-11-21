# Android-Launch-Modes
Android-Launch-Modes



        standard
        activities => 1 2 3
        visiting order=> 1 2 3 2 1 3 2
        back order => 2 3 1 2 3 2 1

        single task (2 is single task)
        activities => 1 2 3
        visiting order => 1 2 3 1 3 1 3 2
        backing order  => 2 1

        single top (2 is single top)
        activities => 1 2 3
        visiting order => 1 2 3 2 2
        backing order  => 2 3 2 1


        single instance ( 2 is single instance)
        activities => 1 2 3
        visiting order => 1 3 1 3 2 1
        backing order=> 1 3 1 3 1 2
        visiting order => 1 3 2 3 2
        backing order=> 2 3 3 1
