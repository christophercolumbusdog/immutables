package org.immutables.generate.silly;

import java.util.Set;
import org.immutables.value.Value;

@Value.Immutable
public abstract class SillyOrdinalHolder {
  public abstract Set<SillyOrdinal> set();
}
