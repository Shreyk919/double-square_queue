package implementations

import operations.{DoubleQueue, SquareQueue}

  /*
    main object to implement double and square queue
   */
  object main {

    /*
      main method
     */
    def main(args: Array[String]): Unit = {
      val queueDouble = new DoubleQueue
      val queueSquare = new SquareQueue

      /*
        Doubling the queue elements
       */
      queueDouble.enqueue(key = 15)
      queueDouble.enqueue(key = 6)
      queueDouble.enqueue(key = 32)
      queueDouble.enqueue(key = 5)
      queueDouble.dequeue()
      queueDouble.dequeue()
      queueDouble.enqueue(key = 69)

      println(" Double of queue elements is: ")
      for (key <- queueDouble.printQueue) {
        print(s"$key ")
      }

      print("\n")

      /*
      Squaring the queue elements
       */
      queueSquare.enqueue(key = 15)
      queueSquare.enqueue(key = 6)
      queueSquare.enqueue(key = 32)
      queueSquare.enqueue(key = 5)
      queueSquare.dequeue()
      queueSquare.dequeue()
      queueSquare.enqueue(key = 69)

      println("\n Square of queue elements is: ")
      for (key <- queueSquare.printQueue) {
        print(s"$key ")
      }

      print("\n")

    }

}
