package com.samples;

/**
 * Calculate max profit in one iteration O(N)
 * @author Sandeep
 *
 */
public class BuyingSelling
{

	public static void main(String[] args)
	{
		int[] stockPrices = { 10, 13, 4, 6, 8 };

		System.out.println(maxProfit(stockPrices));
	}

	public static int maxProfit(int[] stockPrices)
	{
		int profit = 0;
		int minBuyPrice = Integer.MAX_VALUE;

		for (int i = 0; i < stockPrices.length; i++)
		{
			profit = Math.max(profit, stockPrices[i] - minBuyPrice);
			minBuyPrice = Math.min(minBuyPrice, stockPrices[i]);
		}

		return profit;
	}
}
