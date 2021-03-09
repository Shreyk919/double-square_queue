package operations

import traits.queue

class DoubleQueue extends queue{

  /*
    override method to double the queue elements
   */
  override def enqueue(key: Int): Unit = {

    if (top == -1 && bottom == -1) {
      top += 1
      list = list :+ (2 * key)
    }

    else {
      list = list :+ (2 * key)
    }

    bottom += 1
  }

}
