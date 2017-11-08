// Copyright 2017 Sebastian Kuerten
//
// This file is part of jsweet-slfj4-console.
//
// jsweet-slfj4-console is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// jsweet-slfj4-console is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with jsweet-slfj4-console. If not, see <http://www.gnu.org/licenses/>.

package org.slf4j;

import static def.dom.Globals.console;

import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MessageFormatter;

public class ConsoleLoggerImpl implements Logger
{

	private String name;
	private LogLevel level;

	public ConsoleLoggerImpl(String name, LogLevel level)
	{
		this.name = name;
		this.level = level;
	}

	@Override
	public String getName()
	{
		return name;
	}

	private boolean hasLevel(LogLevel required)
	{
		return level.getValue() >= required.getValue();
	}

	private void log(LogLevel level, String message, Throwable throwable)
	{
		String completeMessage;
		if (throwable == null) {
			completeMessage = message;
		} else {
			completeMessage = message + " " + throwable;
		}
		log(level, completeMessage);
	}

	private void log(LogLevel level, String completeMessage)
	{
		switch (level) {
		case DEBUG:
			console.debug(completeMessage);
			break;
		case TRACE:
			console.trace(completeMessage);
			break;
		default:
		case INFO:
			console.info(completeMessage);
			break;
		case WARN:
			console.warn(completeMessage);
			break;
		case ERROR:
			console.error(completeMessage);
			break;
		}
	}

	@Override
	public boolean isTraceEnabled()
	{
		return hasLevel(LogLevel.TRACE);
	}

	@Override
	public boolean isTraceEnabled(Marker marker)
	{
		return hasLevel(LogLevel.TRACE);
	}

	@Override
	public boolean isDebugEnabled()
	{
		return hasLevel(LogLevel.DEBUG);
	}

	@Override
	public boolean isDebugEnabled(Marker marker)
	{
		return hasLevel(LogLevel.DEBUG);
	}

	@Override
	public boolean isInfoEnabled()
	{
		return hasLevel(LogLevel.INFO);
	}

	@Override
	public boolean isInfoEnabled(Marker marker)
	{
		return hasLevel(LogLevel.INFO);
	}

	@Override
	public boolean isWarnEnabled()
	{
		return hasLevel(LogLevel.WARN);
	}

	@Override
	public boolean isWarnEnabled(Marker marker)
	{
		return hasLevel(LogLevel.WARN);
	}

	@Override
	public boolean isErrorEnabled()
	{
		return hasLevel(LogLevel.ERROR);
	}

	@Override
	public boolean isErrorEnabled(Marker marker)
	{
		return hasLevel(LogLevel.ERROR);
	}

	@Override
	public void trace(String msg)
	{
		if (isTraceEnabled()) {
			log(LogLevel.TRACE, msg, null);
		}
	}

	@Override
	public void trace(String format, Object arg)
	{
		if (isTraceEnabled()) {
			FormattingTuple ft = MessageFormatter.format(format, arg);
			log(LogLevel.TRACE, ft.getMessage(), ft.getThrowable());
		}
	}

	@Override
	public void trace(String format, Object arg1, Object arg2)
	{
		if (isTraceEnabled()) {
			FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
			log(LogLevel.TRACE, ft.getMessage(), ft.getThrowable());
		}
	}

	@Override
	public void trace(String format, Object[] argArray)
	{
		if (isTraceEnabled()) {
			FormattingTuple ft = MessageFormatter.format(format, argArray);
			log(LogLevel.TRACE, ft.getMessage(), ft.getThrowable());
		}
	}

	@Override
	public void trace(String msg, Throwable t)
	{
		if (isTraceEnabled()) {
			log(LogLevel.TRACE, msg, t);
		}
	}

	@Override
	public void trace(Marker marker, String msg)
	{
		trace(msg);
	}

	@Override
	public void trace(Marker marker, String format, Object arg)
	{
		trace(format, arg);
	}

	@Override
	public void trace(Marker marker, String format, Object arg1, Object arg2)
	{
		trace(format, arg1, arg2);
	}

	@Override
	public void trace(Marker marker, String format, Object[] argArray)
	{
		trace(format, argArray);
	}

	@Override
	public void trace(Marker marker, String msg, Throwable t)
	{
		trace(msg, t);
	}

	@Override
	public void debug(String msg)
	{
		if (isDebugEnabled()) {
			log(LogLevel.DEBUG, msg, null);
		}
	}

	@Override
	public void debug(String format, Object arg)
	{
		if (isDebugEnabled()) {
			FormattingTuple ft = MessageFormatter.format(format, arg);
			log(LogLevel.DEBUG, ft.getMessage(), ft.getThrowable());
		}
	}

	@Override
	public void debug(String format, Object arg1, Object arg2)
	{
		if (isDebugEnabled()) {
			FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
			log(LogLevel.DEBUG, ft.getMessage(), ft.getThrowable());
		}
	}

	@Override
	public void debug(String format, Object[] argArray)
	{
		if (isDebugEnabled()) {
			FormattingTuple ft = MessageFormatter.format(format, argArray);
			log(LogLevel.DEBUG, ft.getMessage(), ft.getThrowable());
		}
	}

	@Override
	public void debug(String msg, Throwable t)
	{
		if (isDebugEnabled()) {
			log(LogLevel.DEBUG, msg, t);
		}
	}

	@Override
	public void debug(Marker marker, String msg)
	{
		debug(msg);
	}

	@Override
	public void debug(Marker marker, String format, Object arg)
	{
		debug(format, arg);
	}

	@Override
	public void debug(Marker marker, String format, Object arg1, Object arg2)
	{
		debug(format, arg1, arg2);
	}

	@Override
	public void debug(Marker marker, String format, Object[] argArray)
	{
		debug(format, argArray);
	}

	@Override
	public void debug(Marker marker, String msg, Throwable t)
	{
		debug(msg, t);
	}

	@Override
	public void info(String msg)
	{
		if (isInfoEnabled()) {
			log(LogLevel.INFO, msg, null);
		}
	}

	@Override
	public void info(String format, Object arg)
	{
		if (isInfoEnabled()) {
			FormattingTuple ft = MessageFormatter.format(format, arg);
			log(LogLevel.INFO, ft.getMessage(), ft.getThrowable());
		}
	}

	@Override
	public void info(String format, Object arg1, Object arg2)
	{
		if (isInfoEnabled()) {
			FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
			log(LogLevel.INFO, ft.getMessage(), ft.getThrowable());
		}
	}

	@Override
	public void info(String format, Object[] argArray)
	{
		if (isInfoEnabled()) {
			FormattingTuple ft = MessageFormatter.format(format, argArray);
			log(LogLevel.INFO, ft.getMessage(), ft.getThrowable());
		}
	}

	@Override
	public void info(String msg, Throwable t)
	{
		if (isInfoEnabled()) {
			log(LogLevel.INFO, msg, t);
		}
	}

	@Override
	public void info(Marker marker, String msg)
	{
		info(msg);
	}

	@Override
	public void info(Marker marker, String format, Object arg)
	{
		info(format, arg);
	}

	@Override
	public void info(Marker marker, String format, Object arg1, Object arg2)
	{
		info(format, arg1, arg2);
	}

	@Override
	public void info(Marker marker, String format, Object[] argArray)
	{
		info(format, argArray);
	}

	@Override
	public void info(Marker marker, String msg, Throwable t)
	{
		info(msg, t);
	}

	@Override
	public void warn(String msg)
	{
		if (isWarnEnabled()) {
			log(LogLevel.WARN, msg, null);
		}
	}

	@Override
	public void warn(String format, Object arg)
	{
		if (isWarnEnabled()) {
			FormattingTuple ft = MessageFormatter.format(format, arg);
			log(LogLevel.WARN, ft.getMessage(), ft.getThrowable());
		}
	}

	@Override
	public void warn(String format, Object arg1, Object arg2)
	{
		if (isWarnEnabled()) {
			FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
			log(LogLevel.WARN, ft.getMessage(), ft.getThrowable());
		}
	}

	@Override
	public void warn(String format, Object[] argArray)
	{
		if (isWarnEnabled()) {
			FormattingTuple ft = MessageFormatter.format(format, argArray);
			log(LogLevel.WARN, ft.getMessage(), ft.getThrowable());
		}
	}

	@Override
	public void warn(String msg, Throwable t)
	{
		if (isWarnEnabled()) {
			log(LogLevel.WARN, msg, t);
		}
	}

	@Override
	public void warn(Marker marker, String msg)
	{
		warn(msg);
	}

	@Override
	public void warn(Marker marker, String format, Object arg)
	{
		warn(format, arg);
	}

	@Override
	public void warn(Marker marker, String format, Object arg1, Object arg2)
	{
		warn(format, arg1, arg2);
	}

	@Override
	public void warn(Marker marker, String format, Object[] argArray)
	{
		warn(format, argArray);
	}

	@Override
	public void warn(Marker marker, String msg, Throwable t)
	{
		warn(msg, t);
	}

	@Override
	public void error(String msg)
	{
		if (isErrorEnabled()) {
			log(LogLevel.ERROR, msg, null);
		}
	}

	@Override
	public void error(String format, Object arg)
	{
		if (isErrorEnabled()) {
			FormattingTuple ft = MessageFormatter.format(format, arg);
			log(LogLevel.ERROR, ft.getMessage(), ft.getThrowable());
		}
	}

	@Override
	public void error(String format, Object arg1, Object arg2)
	{
		if (isErrorEnabled()) {
			FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
			log(LogLevel.ERROR, ft.getMessage(), ft.getThrowable());
		}
	}

	@Override
	public void error(String format, Object[] argArray)
	{
		if (isErrorEnabled()) {
			FormattingTuple ft = MessageFormatter.format(format, argArray);
			log(LogLevel.ERROR, ft.getMessage(), ft.getThrowable());
		}
	}

	@Override
	public void error(String msg, Throwable t)
	{
		if (isErrorEnabled()) {
			log(LogLevel.ERROR, msg, t);
		}
	}

	@Override
	public void error(Marker marker, String msg)
	{
		error(msg);
	}

	@Override
	public void error(Marker marker, String format, Object arg)
	{
		error(format, arg);
	}

	@Override
	public void error(Marker marker, String format, Object arg1, Object arg2)
	{
		error(format, arg1, arg2);
	}

	@Override
	public void error(Marker marker, String format, Object[] argArray)
	{
		error(format, argArray);
	}

	@Override
	public void error(Marker marker, String msg, Throwable t)
	{
		error(msg, t);
	}

}
