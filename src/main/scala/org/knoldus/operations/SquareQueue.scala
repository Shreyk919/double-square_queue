package operations

import traits.queue

class SquareQueue extends queue{

  /*
    override method to square the queue elements
   */
  override def enqueue(key: Int) : Unit = {

    if (top == -1 && bottom == -1) {
      top += 1
      list = list :+ (key * key)
    }

    else {
      list = list :+ (key * key)
    }

    bottom += 1

  }

}
