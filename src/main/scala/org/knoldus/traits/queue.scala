package traits

  /*
    queue trait with enqueue and dequeue methods
   */
  trait queue {
    var list: List[Int] = List()
    var top: Int = 0
    var bottom: Int = 0

    /*
      enqueue method for addition
     */
    def enqueue(input: Int): Unit = {

      if(top == - 1 && bottom == - 1) {
      top += 1
      list = list :+ input
    }

      else {
      list = list :+ input
    }

      bottom = bottom + 1
    }

    /*
    dequeue method for deletion
     */
    def dequeue(): Unit = {

      if(top == - 1 && bottom == - 1) {
      println ("Underflow")
    }

      else if(top == bottom) {
      list = list.drop (1)
      bottom = - 1
      top = - 1
    }

      else {
      list = list.drop (1)
      top = top + 1
    }
    }

    /*
      method to print queue
     */
    def printQueue: List[Int] = {
      list
    }
  }