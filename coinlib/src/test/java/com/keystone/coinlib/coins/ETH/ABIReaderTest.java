package com.keystone.coinlib.coins.ETH;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ABIReaderTest {
    public String testABI = "[{\"inputs\": [{\"internalType\": \"address\", \"name\": \"_factory\", \"type\": \"address\"}, {\"internalType\": \"address\", \"name\": \"_WETH9\", \"type\": \"address\"}], \"stateMutability\": \"nonpayable\", \"type\": \"constructor\"}, {\"inputs\": [], \"name\": \"WETH9\", \"outputs\": [{\"internalType\": \"address\", \"name\": \"\", \"type\": \"address\"}], \"stateMutability\": \"view\", \"type\": \"function\"}, {\"inputs\": [{\"components\": [{\"internalType\": \"bytes\", \"name\": \"path\", \"type\": \"bytes\"}, {\"internalType\": \"address\", \"name\": \"recipient\", \"type\": \"address\"}, {\"internalType\": \"uint256\", \"name\": \"deadline\", \"type\": \"uint256\"}, {\"internalType\": \"uint256\", \"name\": \"amountIn\", \"type\": \"uint256\"}, {\"internalType\": \"uint256\", \"name\": \"amountOutMinimum\", \"type\": \"uint256\"}], \"internalType\": \"struct ISwapRouter.ExactInputParams\", \"name\": \"params\", \"type\": \"tuple\"}], \"name\": \"exactInput\", \"outputs\": [{\"internalType\": \"uint256\", \"name\": \"amountOut\", \"type\": \"uint256\"}], \"stateMutability\": \"payable\", \"type\": \"function\"}, {\"inputs\": [{\"components\": [{\"internalType\": \"address\", \"name\": \"tokenIn\", \"type\": \"address\"}, {\"internalType\": \"address\", \"name\": \"tokenOut\", \"type\": \"address\"}, {\"internalType\": \"uint24\", \"name\": \"fee\", \"type\": \"uint24\"}, {\"internalType\": \"address\", \"name\": \"recipient\", \"type\": \"address\"}, {\"internalType\": \"uint256\", \"name\": \"deadline\", \"type\": \"uint256\"}, {\"internalType\": \"uint256\", \"name\": \"amountIn\", \"type\": \"uint256\"}, {\"internalType\": \"uint256\", \"name\": \"amountOutMinimum\", \"type\": \"uint256\"}, {\"internalType\": \"uint160\", \"name\": \"sqrtPriceLimitX96\", \"type\": \"uint160\"}], \"internalType\": \"struct ISwapRouter.ExactInputSingleParams\", \"name\": \"params\", \"type\": \"tuple\"}], \"name\": \"exactInputSingle\", \"outputs\": [{\"internalType\": \"uint256\", \"name\": \"amountOut\", \"type\": \"uint256\"}], \"stateMutability\": \"payable\", \"type\": \"function\"}, {\"inputs\": [{\"components\": [{\"internalType\": \"bytes\", \"name\": \"path\", \"type\": \"bytes\"}, {\"internalType\": \"address\", \"name\": \"recipient\", \"type\": \"address\"}, {\"internalType\": \"uint256\", \"name\": \"deadline\", \"type\": \"uint256\"}, {\"internalType\": \"uint256\", \"name\": \"amountOut\", \"type\": \"uint256\"}, {\"internalType\": \"uint256\", \"name\": \"amountInMaximum\", \"type\": \"uint256\"}], \"internalType\": \"struct ISwapRouter.ExactOutputParams\", \"name\": \"params\", \"type\": \"tuple\"}], \"name\": \"exactOutput\", \"outputs\": [{\"internalType\": \"uint256\", \"name\": \"amountIn\", \"type\": \"uint256\"}], \"stateMutability\": \"payable\", \"type\": \"function\"}, {\"inputs\": [{\"components\": [{\"internalType\": \"address\", \"name\": \"tokenIn\", \"type\": \"address\"}, {\"internalType\": \"address\", \"name\": \"tokenOut\", \"type\": \"address\"}, {\"internalType\": \"uint24\", \"name\": \"fee\", \"type\": \"uint24\"}, {\"internalType\": \"address\", \"name\": \"recipient\", \"type\": \"address\"}, {\"internalType\": \"uint256\", \"name\": \"deadline\", \"type\": \"uint256\"}, {\"internalType\": \"uint256\", \"name\": \"amountOut\", \"type\": \"uint256\"}, {\"internalType\": \"uint256\", \"name\": \"amountInMaximum\", \"type\": \"uint256\"}, {\"internalType\": \"uint160\", \"name\": \"sqrtPriceLimitX96\", \"type\": \"uint160\"}], \"internalType\": \"struct ISwapRouter.ExactOutputSingleParams\", \"name\": \"params\", \"type\": \"tuple\"}], \"name\": \"exactOutputSingle\", \"outputs\": [{\"internalType\": \"uint256\", \"name\": \"amountIn\", \"type\": \"uint256\"}], \"stateMutability\": \"payable\", \"type\": \"function\"}, {\"inputs\": [], \"name\": \"factory\", \"outputs\": [{\"internalType\": \"address\", \"name\": \"\", \"type\": \"address\"}], \"stateMutability\": \"view\", \"type\": \"function\"}, {\"inputs\": [{\"internalType\": \"bytes[]\", \"name\": \"data\", \"type\": \"bytes[]\"}], \"name\": \"multicall\", \"outputs\": [{\"internalType\": \"bytes[]\", \"name\": \"results\", \"type\": \"bytes[]\"}], \"stateMutability\": \"payable\", \"type\": \"function\"}, {\"inputs\": [], \"name\": \"refundETH\", \"outputs\": [], \"stateMutability\": \"payable\", \"type\": \"function\"}, {\"inputs\": [{\"internalType\": \"address\", \"name\": \"token\", \"type\": \"address\"}, {\"internalType\": \"uint256\", \"name\": \"value\", \"type\": \"uint256\"}, {\"internalType\": \"uint256\", \"name\": \"deadline\", \"type\": \"uint256\"}, {\"internalType\": \"uint8\", \"name\": \"v\", \"type\": \"uint8\"}, {\"internalType\": \"bytes32\", \"name\": \"r\", \"type\": \"bytes32\"}, {\"internalType\": \"bytes32\", \"name\": \"s\", \"type\": \"bytes32\"}], \"name\": \"selfPermit\", \"outputs\": [], \"stateMutability\": \"payable\", \"type\": \"function\"}, {\"inputs\": [{\"internalType\": \"address\", \"name\": \"token\", \"type\": \"address\"}, {\"internalType\": \"uint256\", \"name\": \"nonce\", \"type\": \"uint256\"}, {\"internalType\": \"uint256\", \"name\": \"expiry\", \"type\": \"uint256\"}, {\"internalType\": \"uint8\", \"name\": \"v\", \"type\": \"uint8\"}, {\"internalType\": \"bytes32\", \"name\": \"r\", \"type\": \"bytes32\"}, {\"internalType\": \"bytes32\", \"name\": \"s\", \"type\": \"bytes32\"}], \"name\": \"selfPermitAllowed\", \"outputs\": [], \"stateMutability\": \"payable\", \"type\": \"function\"}, {\"inputs\": [{\"internalType\": \"address\", \"name\": \"token\", \"type\": \"address\"}, {\"internalType\": \"uint256\", \"name\": \"nonce\", \"type\": \"uint256\"}, {\"internalType\": \"uint256\", \"name\": \"expiry\", \"type\": \"uint256\"}, {\"internalType\": \"uint8\", \"name\": \"v\", \"type\": \"uint8\"}, {\"internalType\": \"bytes32\", \"name\": \"r\", \"type\": \"bytes32\"}, {\"internalType\": \"bytes32\", \"name\": \"s\", \"type\": \"bytes32\"}], \"name\": \"selfPermitAllowedIfNecessary\", \"outputs\": [], \"stateMutability\": \"payable\", \"type\": \"function\"}, {\"inputs\": [{\"internalType\": \"address\", \"name\": \"token\", \"type\": \"address\"}, {\"internalType\": \"uint256\", \"name\": \"value\", \"type\": \"uint256\"}, {\"internalType\": \"uint256\", \"name\": \"deadline\", \"type\": \"uint256\"}, {\"internalType\": \"uint8\", \"name\": \"v\", \"type\": \"uint8\"}, {\"internalType\": \"bytes32\", \"name\": \"r\", \"type\": \"bytes32\"}, {\"internalType\": \"bytes32\", \"name\": \"s\", \"type\": \"bytes32\"}], \"name\": \"selfPermitIfNecessary\", \"outputs\": [], \"stateMutability\": \"payable\", \"type\": \"function\"}, {\"inputs\": [{\"internalType\": \"address\", \"name\": \"token\", \"type\": \"address\"}, {\"internalType\": \"uint256\", \"name\": \"amountMinimum\", \"type\": \"uint256\"}, {\"internalType\": \"address\", \"name\": \"recipient\", \"type\": \"address\"}], \"name\": \"sweepToken\", \"outputs\": [], \"stateMutability\": \"payable\", \"type\": \"function\"}, {\"inputs\": [{\"internalType\": \"address\", \"name\": \"token\", \"type\": \"address\"}, {\"internalType\": \"uint256\", \"name\": \"amountMinimum\", \"type\": \"uint256\"}, {\"internalType\": \"address\", \"name\": \"recipient\", \"type\": \"address\"}, {\"internalType\": \"uint256\", \"name\": \"feeBips\", \"type\": \"uint256\"}, {\"internalType\": \"address\", \"name\": \"feeRecipient\", \"type\": \"address\"}], \"name\": \"sweepTokenWithFee\", \"outputs\": [], \"stateMutability\": \"payable\", \"type\": \"function\"}, {\"inputs\": [{\"internalType\": \"int256\", \"name\": \"amount0Delta\", \"type\": \"int256\"}, {\"internalType\": \"int256\", \"name\": \"amount1Delta\", \"type\": \"int256\"}, {\"internalType\": \"bytes\", \"name\": \"_data\", \"type\": \"bytes\"}], \"name\": \"uniswapV3SwapCallback\", \"outputs\": [], \"stateMutability\": \"nonpayable\", \"type\": \"function\"}, {\"inputs\": [{\"internalType\": \"uint256\", \"name\": \"amountMinimum\", \"type\": \"uint256\"}, {\"internalType\": \"address\", \"name\": \"recipient\", \"type\": \"address\"}], \"name\": \"unwrapWETH9\", \"outputs\": [], \"stateMutability\": \"payable\", \"type\": \"function\"}, {\"inputs\": [{\"internalType\": \"uint256\", \"name\": \"amountMinimum\", \"type\": \"uint256\"}, {\"internalType\": \"address\", \"name\": \"recipient\", \"type\": \"address\"}, {\"internalType\": \"uint256\", \"name\": \"feeBips\", \"type\": \"uint256\"}, {\"internalType\": \"address\", \"name\": \"feeRecipient\", \"type\": \"address\"}], \"name\": \"unwrapWETH9WithFee\", \"outputs\": [], \"stateMutability\": \"payable\", \"type\": \"function\"}, {\"stateMutability\": \"payable\", \"type\": \"receive\"}]";
    public String testABI2 = "[\n" +
            "  {\n" +
            "    \"inputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"_factory\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"_WETH\",\n" +
            "        \"type\": \"address\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"stateMutability\": \"nonpayable\",\n" +
            "    \"type\": \"constructor\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"inputs\": [],\n" +
            "    \"name\": \"WETH\",\n" +
            "    \"outputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"\",\n" +
            "        \"type\": \"address\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"stateMutability\": \"view\",\n" +
            "    \"type\": \"function\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"inputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"tokenA\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"tokenB\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountADesired\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountBDesired\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountAMin\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountBMin\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"to\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"deadline\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\": \"addLiquidity\",\n" +
            "    \"outputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountA\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountB\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"liquidity\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"stateMutability\": \"nonpayable\",\n" +
            "    \"type\": \"function\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"inputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"token\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountTokenDesired\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountTokenMin\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountETHMin\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"to\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"deadline\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\": \"addLiquidityETH\",\n" +
            "    \"outputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountToken\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountETH\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"liquidity\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"stateMutability\": \"payable\",\n" +
            "    \"type\": \"function\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"inputs\": [],\n" +
            "    \"name\": \"factory\",\n" +
            "    \"outputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"\",\n" +
            "        \"type\": \"address\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"stateMutability\": \"view\",\n" +
            "    \"type\": \"function\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"inputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountOut\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"reserveIn\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"reserveOut\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\": \"getAmountIn\",\n" +
            "    \"outputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountIn\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"stateMutability\": \"pure\",\n" +
            "    \"type\": \"function\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"inputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountIn\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"reserveIn\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"reserveOut\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\": \"getAmountOut\",\n" +
            "    \"outputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountOut\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"stateMutability\": \"pure\",\n" +
            "    \"type\": \"function\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"inputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountOut\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address[]\",\n" +
            "        \"name\": \"path\",\n" +
            "        \"type\": \"address[]\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\": \"getAmountsIn\",\n" +
            "    \"outputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256[]\",\n" +
            "        \"name\": \"amounts\",\n" +
            "        \"type\": \"uint256[]\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"stateMutability\": \"view\",\n" +
            "    \"type\": \"function\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"inputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountIn\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address[]\",\n" +
            "        \"name\": \"path\",\n" +
            "        \"type\": \"address[]\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\": \"getAmountsOut\",\n" +
            "    \"outputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256[]\",\n" +
            "        \"name\": \"amounts\",\n" +
            "        \"type\": \"uint256[]\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"stateMutability\": \"view\",\n" +
            "    \"type\": \"function\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"inputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountA\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"reserveA\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"reserveB\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\": \"quote\",\n" +
            "    \"outputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountB\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"stateMutability\": \"pure\",\n" +
            "    \"type\": \"function\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"inputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"tokenA\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"tokenB\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"liquidity\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountAMin\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountBMin\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"to\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"deadline\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\": \"removeLiquidity\",\n" +
            "    \"outputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountA\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountB\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"stateMutability\": \"nonpayable\",\n" +
            "    \"type\": \"function\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"inputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"token\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"liquidity\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountTokenMin\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountETHMin\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"to\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"deadline\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\": \"removeLiquidityETH\",\n" +
            "    \"outputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountToken\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountETH\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"stateMutability\": \"nonpayable\",\n" +
            "    \"type\": \"function\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"inputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"token\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"liquidity\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountTokenMin\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountETHMin\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"to\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"deadline\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\": \"removeLiquidityETHSupportingFeeOnTransferTokens\",\n" +
            "    \"outputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountETH\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"stateMutability\": \"nonpayable\",\n" +
            "    \"type\": \"function\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"inputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"token\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"liquidity\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountTokenMin\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountETHMin\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"to\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"deadline\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"bool\",\n" +
            "        \"name\": \"approveMax\",\n" +
            "        \"type\": \"bool\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint8\",\n" +
            "        \"name\": \"v\",\n" +
            "        \"type\": \"uint8\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"bytes32\",\n" +
            "        \"name\": \"r\",\n" +
            "        \"type\": \"bytes32\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"bytes32\",\n" +
            "        \"name\": \"s\",\n" +
            "        \"type\": \"bytes32\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\": \"removeLiquidityETHWithPermit\",\n" +
            "    \"outputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountToken\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountETH\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"stateMutability\": \"nonpayable\",\n" +
            "    \"type\": \"function\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"inputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"token\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"liquidity\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountTokenMin\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountETHMin\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"to\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"deadline\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"bool\",\n" +
            "        \"name\": \"approveMax\",\n" +
            "        \"type\": \"bool\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint8\",\n" +
            "        \"name\": \"v\",\n" +
            "        \"type\": \"uint8\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"bytes32\",\n" +
            "        \"name\": \"r\",\n" +
            "        \"type\": \"bytes32\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"bytes32\",\n" +
            "        \"name\": \"s\",\n" +
            "        \"type\": \"bytes32\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\": \"removeLiquidityETHWithPermitSupportingFeeOnTransferTokens\",\n" +
            "    \"outputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountETH\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"stateMutability\": \"nonpayable\",\n" +
            "    \"type\": \"function\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"inputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"tokenA\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"tokenB\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"liquidity\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountAMin\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountBMin\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"to\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"deadline\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"bool\",\n" +
            "        \"name\": \"approveMax\",\n" +
            "        \"type\": \"bool\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint8\",\n" +
            "        \"name\": \"v\",\n" +
            "        \"type\": \"uint8\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"bytes32\",\n" +
            "        \"name\": \"r\",\n" +
            "        \"type\": \"bytes32\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"bytes32\",\n" +
            "        \"name\": \"s\",\n" +
            "        \"type\": \"bytes32\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\": \"removeLiquidityWithPermit\",\n" +
            "    \"outputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountA\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountB\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"stateMutability\": \"nonpayable\",\n" +
            "    \"type\": \"function\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"inputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountOut\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address[]\",\n" +
            "        \"name\": \"path\",\n" +
            "        \"type\": \"address[]\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"to\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"deadline\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\": \"swapETHForExactTokens\",\n" +
            "    \"outputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256[]\",\n" +
            "        \"name\": \"amounts\",\n" +
            "        \"type\": \"uint256[]\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"stateMutability\": \"payable\",\n" +
            "    \"type\": \"function\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"inputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountOutMin\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address[]\",\n" +
            "        \"name\": \"path\",\n" +
            "        \"type\": \"address[]\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"to\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"deadline\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\": \"swapExactETHForTokens\",\n" +
            "    \"outputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256[]\",\n" +
            "        \"name\": \"amounts\",\n" +
            "        \"type\": \"uint256[]\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"stateMutability\": \"payable\",\n" +
            "    \"type\": \"function\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"inputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountOutMin\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address[]\",\n" +
            "        \"name\": \"path\",\n" +
            "        \"type\": \"address[]\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"to\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"deadline\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\": \"swapExactETHForTokensSupportingFeeOnTransferTokens\",\n" +
            "    \"outputs\": [],\n" +
            "    \"stateMutability\": \"payable\",\n" +
            "    \"type\": \"function\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"inputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountIn\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountOutMin\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address[]\",\n" +
            "        \"name\": \"path\",\n" +
            "        \"type\": \"address[]\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"to\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"deadline\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\": \"swapExactTokensForETH\",\n" +
            "    \"outputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256[]\",\n" +
            "        \"name\": \"amounts\",\n" +
            "        \"type\": \"uint256[]\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"stateMutability\": \"nonpayable\",\n" +
            "    \"type\": \"function\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"inputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountIn\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountOutMin\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address[]\",\n" +
            "        \"name\": \"path\",\n" +
            "        \"type\": \"address[]\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"to\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"deadline\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\": \"swapExactTokensForETHSupportingFeeOnTransferTokens\",\n" +
            "    \"outputs\": [],\n" +
            "    \"stateMutability\": \"nonpayable\",\n" +
            "    \"type\": \"function\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"inputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountIn\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountOutMin\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address[]\",\n" +
            "        \"name\": \"path\",\n" +
            "        \"type\": \"address[]\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"to\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"deadline\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\": \"swapExactTokensForTokens\",\n" +
            "    \"outputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256[]\",\n" +
            "        \"name\": \"amounts\",\n" +
            "        \"type\": \"uint256[]\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"stateMutability\": \"nonpayable\",\n" +
            "    \"type\": \"function\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"inputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountIn\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountOutMin\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address[]\",\n" +
            "        \"name\": \"path\",\n" +
            "        \"type\": \"address[]\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"to\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"deadline\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\": \"swapExactTokensForTokensSupportingFeeOnTransferTokens\",\n" +
            "    \"outputs\": [],\n" +
            "    \"stateMutability\": \"nonpayable\",\n" +
            "    \"type\": \"function\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"inputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountOut\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountInMax\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address[]\",\n" +
            "        \"name\": \"path\",\n" +
            "        \"type\": \"address[]\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"to\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"deadline\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\": \"swapTokensForExactETH\",\n" +
            "    \"outputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256[]\",\n" +
            "        \"name\": \"amounts\",\n" +
            "        \"type\": \"uint256[]\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"stateMutability\": \"nonpayable\",\n" +
            "    \"type\": \"function\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"inputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountOut\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"amountInMax\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address[]\",\n" +
            "        \"name\": \"path\",\n" +
            "        \"type\": \"address[]\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"address\",\n" +
            "        \"name\": \"to\",\n" +
            "        \"type\": \"address\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"internalType\": \"uint256\",\n" +
            "        \"name\": \"deadline\",\n" +
            "        \"type\": \"uint256\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\": \"swapTokensForExactTokens\",\n" +
            "    \"outputs\": [\n" +
            "      {\n" +
            "        \"internalType\": \"uint256[]\",\n" +
            "        \"name\": \"amounts\",\n" +
            "        \"type\": \"uint256[]\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"stateMutability\": \"nonpayable\",\n" +
            "    \"type\": \"function\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"stateMutability\": \"payable\",\n" +
            "    \"type\": \"receive\"\n" +
            "  }\n" +
            "]";
    public String testCall = "414bf389000000000000000000000000c02aaa39b223fe8d0a0e5c4f27ead9083c756cc20000000000000000000000006b175474e89094c44da98b954eedeac495271d0f00000000000000000000000000000000000000000000000000000000000001f4000000000000000000000000d6cbd2038a6653993009c56912cb45117ab930d80000000000000000000000000000000000000000000000000000000060eea3a50000000000000000000000000000000000000000000000000004806ea7f795c700000000000000000000000000000000000000000000000021345ec32f55c4d00000000000000000000000000000000000000000000000000000000000000000";
    public String testCall2 = "7ff36ab500000000000000000000000000000000000000000000000007c6162c0ceedae80000000000000000000000000000000000000000000000000000000000000080000000000000000000000000fe040716ac4afbba08ee723f3f47d5d814fc48c10000000000000000000000000000000000000000000000000000000060f93b9c0000000000000000000000000000000000000000000000000000000000000003000000000000000000000000c02aaa39b223fe8d0a0e5c4f27ead9083c756cc2000000000000000000000000a0b86991c6218b36c1d19d4a2e9eb0ce3606eb48000000000000000000000000111111111117dc0aa78b770fa6a738034120c302";

    @Test
    public void testABIReader() {
        ABIReader reader = new ABIReader();
        reader.addABI(testABI2);
        ABIReader.DecodedFunctionCall call = reader.decodeCall(testCall2);
        System.out.println(call.toJson().toString());

        //assertEquals("{\"method\":\"exactInputSingle\",\"param\":[{\"name\":\"params\",\"type\":\"tuple\",\"value\":[{\"name\":\"tokenIn\",\"type\":\"address\",\"value\":1097077688018008265106216665536940668749033598146},{\"name\":\"tokenOut\",\"type\":\"address\",\"value\":611382286831621467233887798921843936019654057231},{\"name\":\"fee\",\"type\":\"uint24\",\"value\":500},{\"name\":\"recipient\",\"type\":\"address\",\"value\":1226269371016460918372897725765319732737349333208},{\"name\":\"deadline\",\"type\":\"uint256\",\"value\":1626252197},{\"name\":\"amountIn\",\"type\":\"uint256\",\"value\":1267112659621319},{\"name\":\"amountOutMinimum\",\"type\":\"uint256\",\"value\":2392641494446359760},{\"name\":\"sqrtPriceLimitX96\",\"type\":\"uint160\",\"value\":0}]}]}", call.toJson().toString());
    }
}