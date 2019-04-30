package com.Day22.sell_ticket;

public class Ticket {
    /**
     * 第三题:
     * 1.定义一个Ticket火车票类, 成员变量：ticketNum火车票的数量
     * 2.定义一个线上官网线程类：NetWindow，实现Runnable接口,实现卖票的操作
     * 3.定义一个线下窗口线程类：PhysicalStore，实现Runnable接口,实现卖票的操作
     * 4.使用等待唤醒机制完成交替卖出100张票的功能
     */
    private int ticket = 100;
    private boolean flag = true;//true表示线上卖，false表示线下卖

    public int getTicket() {
        return ticket;
    }

    public synchronized void Netsell() {
        while (ticket > 0) {
            if (!flag) {
                try {
                    wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (ticket <= 0)
                break;
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            ticket--;
            System.out.println(Thread.currentThread().getName() + "卖了一张票,当前剩票" + ticket);
            flag = false;
            notify();
        }
    }

    public synchronized void Physell() {
        while (ticket > 0) {
            if (flag) {
                try {
                    wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (ticket<=0)
                break;
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            ticket--;
            System.out.println(Thread.currentThread().getName() + "卖了一张票,当前剩票" + ticket);
            flag = true;
            notify();
        }
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        NetWindow nw = new NetWindow(ticket);
        PhysicalStore ps = new PhysicalStore(ticket);
        new Thread(nw, "线上官网").start();
        new Thread(ps, "线下窗口").start();
    }
}

class NetWindow implements Runnable {
    private Ticket ticket;

    public NetWindow(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        ticket.Netsell();
    }
}

class PhysicalStore implements Runnable {
    private Ticket ticket;

    public PhysicalStore(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        ticket.Physell();
    }
}
